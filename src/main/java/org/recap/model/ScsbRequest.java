package org.recap.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by chenchulakshmig on 12/10/16.
 */
@Getter
@Setter
public class ScsbRequest {
    private String reportType;
    private String transmissionType;
    private Date dateFrom;
    private Date dateTo;
}
