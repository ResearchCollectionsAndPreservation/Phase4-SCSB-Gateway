package org.recap.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by akulak on 8/3/17.
 */
@Getter
@Setter
public class IncompleteReportResultsRow {
    private String author;
    private String createdDate;
    private String title;
    private String owningInstitution;
    private String customerCode;
    private String barcode;
}
