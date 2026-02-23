package com.github.catvod.spider.merge.b0;

import com.github.catvod.spider.JSDemo;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.whl.quickjs.android.QuickJSLoader;
import com.whl.quickjs.wrapper.QuickJSContext;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ JSDemo b;

    public /* synthetic */ k(JSDemo jSDemo, int i) {
        this.a = i;
        this.b = jSDemo;
    }

    /* renamed from: ۣ۟۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m7530(Object obj) {
        if (C0039.m6529() <= 0) {
            QuickJSLoader.initConsoleLog((QuickJSContext) obj);
        }
    }

    /* renamed from: ۣ۟ۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m7531(Object obj) {
        if (C0033.m5872() >= 0) {
            ((QuickJSContext) obj).destroy();
        }
    }

    /* renamed from: ۨۧۦ۟, reason: not valid java name and contains not printable characters */
    public static QuickJSContext m7532() {
        if (C0064.m9659() < 0) {
            return QuickJSContext.create();
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0029.m5225(this)) {
            case 0:
                JSDemo jSDemoM8608 = C0054.m8608(this);
                C0009.m2093(C0062.m9404(jSDemoM8608));
                m7531(C0004.m1533(jSDemoM8608));
                break;
            default:
                JSDemo jSDemoM86082 = C0054.m8608(this);
                if (C0004.m1533(jSDemoM86082) == null) {
                    QuickJSContext quickJSContextM7532 = m7532();
                    jSDemoM86082.b = quickJSContextM7532;
                    m7530(quickJSContextM7532);
                    break;
                }
                break;
        }
    }
}