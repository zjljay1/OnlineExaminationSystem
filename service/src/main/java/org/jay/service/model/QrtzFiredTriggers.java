package org.jay.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jay
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class QrtzFiredTriggers implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "SCHED_NAME", type = IdType.ID_WORKER)
    private String schedName;

    @TableField("ENTRY_ID")
    private String entryId;

    @TableField("TRIGGER_NAME")
    private String triggerName;

    @TableField("TRIGGER_GROUP")
    private String triggerGroup;

    @TableField("INSTANCE_NAME")
    private String instanceName;

    @TableField("FIRED_TIME")
    private Long firedTime;

    @TableField("SCHED_TIME")
    private Long schedTime;

    @TableField("PRIORITY")
    private Integer priority;

    @TableField("STATE")
    private String state;

    @TableField("JOB_NAME")
    private String jobName;

    @TableField("JOB_GROUP")
    private String jobGroup;

    @TableField("IS_NONCONCURRENT")
    private String isNonconcurrent;

    @TableField("REQUESTS_RECOVERY")
    private String requestsRecovery;


}
