/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-09-29 19:53 创建
 */
package org.bekit.flow.listener;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * 特定流程事件类型
 */
public class TheFlowEventType {
    // 流程
    private String flow;
    // 类型
    private Class eventClass;

    public TheFlowEventType(String flow, Class eventClass) {
        this.flow = flow;
        this.eventClass = eventClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flow, eventClass);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TheFlowEventType)) {
            return false;
        }
        TheFlowEventType other = (TheFlowEventType) obj;
        return StringUtils.equals(flow, other.flow) && eventClass == other.eventClass;
    }
}
