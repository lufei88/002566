package com.github.catvod.spider.merge.c;

import com.github.catvod.spider.merge.a1.d;
import com.github.catvod.spider.merge.d0.C0048;

/* renamed from: com.github.catvod.spider.merge.c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264a extends d {
    public static volatile C0264a b;
    public final Object a;

    public C0264a(int i) {
        switch (i) {
            case 1:
                this.a = new Object();
                C0048.m7917(4, new ThreadFactoryC0265b());
                break;
            default:
                this.a = new C0264a(1);
                break;
        }
    }
}