package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* loaded from: classes.dex */
public abstract class q extends RuntimeException {
    public final s a;
    public final p b;
    public final j c;
    public d d;
    public int e;

    public q(s sVar, j jVar, p pVar) {
        this.e = -1;
        this.a = sVar;
        this.c = jVar;
        this.b = pVar;
        if (sVar != null) {
            this.e = C0007.m1861(sVar);
        }
    }
}