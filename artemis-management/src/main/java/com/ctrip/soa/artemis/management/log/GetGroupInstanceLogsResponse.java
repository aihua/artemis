package com.ctrip.soa.artemis.management.log;

import com.ctrip.soa.artemis.HasResponseStatus;
import com.ctrip.soa.artemis.ResponseStatus;
import com.ctrip.soa.artemis.management.group.log.GroupInstanceLog;

import java.util.List;

/**
 * Created by fang_j on 10/07/2016.
 */
public class GetGroupInstanceLogsResponse  implements HasResponseStatus {
    private ResponseStatus responseStatus;
    private List<GroupInstanceLog> logs;

    @Override
    public ResponseStatus getResponseStatus() {
        return this.responseStatus;
    }

    @Override
    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public List<GroupInstanceLog> getLogs() {
        return logs;
    }

    public void setLogs(List<GroupInstanceLog> logs) {
        this.logs = logs;
    }
}
