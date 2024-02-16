package com.shen.ojbackendjudgeservice.judge.codesandbox;

import com.shen.ojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.shen.ojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest 请求参数
     * @return 执行结果
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
