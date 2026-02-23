package com.github.catvod.spider.merge.S0;

import com.github.catvod.spider.merge.Y.C0035;
import java.util.Stack;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class a extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (C0035.m6117(this)) {
            case 0:
                return new Stack();
            default:
                return new Inflater();
        }
    }
}