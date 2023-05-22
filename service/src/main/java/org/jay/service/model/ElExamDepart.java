package org.jay.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 考试部门
 * </p>
 *
 * @author Jay
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ElExamDepart implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
      @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    /**
     * 考试ID
     */
    private String examId;

    /**
     * 部门ID
     */
    private String departId;


}
