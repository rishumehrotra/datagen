/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.rr;

/**
 *
 * @author rishu.mehrotra
 */
public class Site {
    
    
    protected Integer siteIncId;
    protected Integer siteOtherId;
    protected String rqMkSiteId;

    public Integer getSiteIncId() {
        return siteIncId;
    }

    public void setSiteIncId(Integer siteIncId) {
        this.siteIncId = siteIncId;
    }

    public Integer getSiteOtherId() {
        return siteOtherId;
    }

    public void setSiteOtherId(Integer siteOtherId) {
        this.siteOtherId = siteOtherId;
    }

    public Site(Integer siteIncId, Integer siteOtherId) {
        this.siteIncId = siteIncId;
        this.siteOtherId = siteOtherId;
    }
    
    
    
    
    
}
