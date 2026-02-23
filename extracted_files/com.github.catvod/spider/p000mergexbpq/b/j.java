package com.github.catvod.spider.p000mergexbpq.b;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.f1.C0053;
import com.google.net.cronet.okhttptransport.CronetInterceptor;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    /* renamed from: ۟ۡۡۧۥ, reason: not valid java name and contains not printable characters */
    public static void m1898(Object obj) {
        if (C0053.m8389() >= 0) {
            CronetInterceptor.a((CronetInterceptor) obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0026.m4893(this)) {
            case 0:
                C0034.m6003((p) C0022.m4394(this));
                break;
            default:
                m1898((CronetInterceptor) C0022.m4394(this));
                break;
        }
    }
}