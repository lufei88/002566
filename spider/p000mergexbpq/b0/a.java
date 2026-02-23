package com.github.catvod.spider.p000mergexbpq.b0;

import java.util.Stack;

/* loaded from: classes.dex */
final class a extends ThreadLocal<Stack<StringBuilder>> {
    a() {
    }

    @Override // java.lang.ThreadLocal
    protected final Stack<StringBuilder> initialValue() {
        return new Stack<>();
    }
}