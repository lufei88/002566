package com.github.catvod.spider.merge.Y0;

import com.github.catvod.spider.merge.E0.p;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import java.util.Stack;

/* loaded from: classes.dex */
public final class c {
    public final Stack a;
    public final a b;

    public c(d dVar) {
        C0063.m9538(c.class);
        Stack stack = new Stack();
        this.a = stack;
        a aVar = new a(dVar);
        this.b = aVar;
        a aVar2 = new a(dVar);
        aVar2.c = aVar;
        C0005.m1657(stack, aVar2);
    }

    public final a a() {
        return (a) C0054.m8609(C0002.m1317(this));
    }

    public final void b(d dVar) {
        ((a) C0054.m8609(C0002.m1317(this))).a = dVar;
    }

    public final Object c(com.github.catvod.spider.merge.I0.b bVar) {
        return C0020.m4276(bVar, this);
    }

    public final Object d(p pVar) {
        int iM6500 = C0039.m6500(pVar);
        Object objM4276 = null;
        for (int i = 0; i < iM6500; i++) {
            objM4276 = C0020.m4276(C0034.m5972(pVar, i), this);
        }
        return objM4276;
    }
}