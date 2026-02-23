package com.github.catvod.spider.p000mergexbpq.b;

import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0010.m2340(this)) {
            case 0:
                C0034.m6003((p) C0041.m6775(this));
                break;
            default:
                C0062.m9379(C0029.m5249(C0031.m5652(), (String) C0041.m6775(this), 1));
                break;
        }
    }
}