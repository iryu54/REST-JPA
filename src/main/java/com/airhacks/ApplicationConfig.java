package com.airhacks;


import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("docs")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        resources.add(com.wordnik.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(com.wordnik.swagger.jaxrs.listing.ApiDeclarationProvider.class);
        resources.add(com.wordnik.swagger.jaxrs.listing.ApiListingResourceJSON.class);
        resources.add(com.wordnik.swagger.jaxrs.listing.ResourceListingProvider.class);
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(boundary.Account.AccountRepresentation.class);
        resources.add(boundary.Account.AuthenticationEndpoint.class);
        resources.add(boundary.BackOffice.BackOfficeRepresentation.class);
        resources.add(boundary.Category.CategoryRepresentation.class);
        resources.add(boundary.Ingredient.IngredientRepresentation.class);
        resources.add(boundary.Order.OrderRepresentation.class);
        resources.add(boundary.Sandwich.SandwichRepresentation.class);
    }

}
