package org.jay.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 试题答案选项
 * </p>
 *
 * @author Jay
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ElQuAnswer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 答案ID
     */
      @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    /**
     * 问题ID
     */
    private String quId;

    /**
     * 是否正确
     */
    private Integer isRight;

    /**
     * 选项图片
     */
    private String image;

    /**
     * 答案内容
     */
    private String content;

    /**
     * 答案分析
     */
    private String analysis;


}
