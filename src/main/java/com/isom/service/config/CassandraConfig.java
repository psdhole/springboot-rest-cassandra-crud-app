package com.isom.service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
import org.springframework.data.cassandra.core.cql.keyspace.DataCenterReplication;
import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.SimpleUserTypeResolver;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableCassandraRepositories(basePackages = "com.isom.service")
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Value("${spring.data.cassandra.contact-points}")
    protected String contactPoints;

    @Value("${spring.data.cassandra.keyspace-name}")
    protected String keyspaceName;

    @Value("${spring.data.cassandra.username}")
    protected String userName;

    @Value("${spring.data.cassandra.password}")
    protected String password;

    @Override
    protected boolean getMetricsEnabled() {
        return false;
    }

    @Override
    protected String getKeyspaceName() {
        return this.keyspaceName;
    }

    @Override
    public String getContactPoints() {
        return contactPoints;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"com.isom.service"};
    }

    @Override
    protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
        return Arrays.asList(
                CreateKeyspaceSpecification.createKeyspace(keyspaceName)
                        .ifNotExists()
                        .withNetworkReplication(DataCenterReplication.of("dc1", 3L)));
    }

    @Bean
    public CassandraMappingContext mappingContext() throws Exception {
        BasicCassandraMappingContext mappingContext = new BasicCassandraMappingContext();
        mappingContext.setUserTypeResolver(new
                SimpleUserTypeResolver(cluster().getObject(), keyspaceName));
        return mappingContext;
    }
}
