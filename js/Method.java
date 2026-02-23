package com.github.catvod.js;

import com.github.catvod.spider.merge.Z.C0038;
import com.whl.quickjs.wrapper.JSMethod;
import com.whl.quickjs.wrapper.QuickJSContext;

/* loaded from: classes.dex */
public class Method {
    private QuickJSContext ctx;

    public Method(QuickJSContext quickJSContext) {
        this.ctx = quickJSContext;
    }

    @JSMethod
    public void showToast(String str) {
        C0038.m6402(str);
    }
}