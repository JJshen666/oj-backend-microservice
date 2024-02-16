package com.shen.ojbackendjudgeservice.judge.codesandbox.impl;

import com.shen.ojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.shen.ojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.shen.ojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.printf("第三方代码沙箱");
        return null;
    }
}
