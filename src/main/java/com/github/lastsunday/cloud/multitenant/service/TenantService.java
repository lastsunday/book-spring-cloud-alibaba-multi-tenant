package com.github.lastsunday.cloud.multitenant.service;

public interface TenantService {

    void loginTenant(Long tenantId);

    Long getTenant();
}
