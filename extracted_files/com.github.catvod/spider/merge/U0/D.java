package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.x0.C0063;

/* loaded from: classes.dex */
public final class D {
    public static final D c = new D(false, false);
    public static final D d = new D(true, true);
    public final boolean a;
    public final boolean b;

    public D(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final void a(com.github.catvod.spider.merge.T0.c cVar) {
        if (cVar == null || C0041.m6754(this)) {
            return;
        }
        for (int i = 0; i < C0029.m5233(cVar); i++) {
            String[] strArrM4450 = C0022.m4450(cVar);
            strArrM4450[i] = C0063.m9572(strArrM4450[i]);
        }
    }
}