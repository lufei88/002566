package com.github.catvod.spider.p000mergexbpq.b;

import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.p000mergexbpq.c.C0009;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ p d;

    public /* synthetic */ i(p pVar, int i) {
        this.c = i;
        this.d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0009.m2129(this)) {
            case 0:
                C0034.m6003(C0009.m2059(this));
                break;
            default:
                C0043.m7318(C0009.m2059(this));
                break;
        }
    }
}