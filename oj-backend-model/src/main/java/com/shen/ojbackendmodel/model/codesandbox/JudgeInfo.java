package com.shen.ojbackendmodel.model.codesandbox;

import lombok.Data;

/**
 * 判题信息
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存（单位：KB）
     */
    private Long memory;

    /**
     * 时间限制（单位：ms）
     */
    private Long time;
}
