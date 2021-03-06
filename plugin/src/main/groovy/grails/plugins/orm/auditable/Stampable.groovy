package grails.plugins.orm.auditable

import org.grails.datastore.gorm.GormEntity

/**
 * Entities should implement this trait to provide automatic stamping of date and user information
 */
trait Stampable<D> extends GormEntity<D> {
    // Grails will automatically populate these
    Date dateCreated
    Date lastUpdated

    // We initialize these to non-null to they pass initial validation, they are set on insert/update
    String createdBy = "N/A"
    String lastUpdatedBy = "N/A"
}
