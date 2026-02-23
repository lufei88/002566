package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.d.C0047;

/* renamed from: com.github.catvod.spider.merge.F0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0151h {
    public static final com.github.catvod.spider.merge.G0.d c;
    public final C0144a a;
    public final S b;

    static {
        C0047.m7825();
        com.github.catvod.spider.merge.G0.d dVar = new com.github.catvod.spider.merge.G0.d(new C0148e(true));
        c = dVar;
        dVar.a = Integer.MAX_VALUE;
    }

    public AbstractC0151h(C0144a c0144a, S s) {
        this.a = c0144a;
        this.b = s;
    }

    public abstract void a();
}