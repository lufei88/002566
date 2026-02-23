package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.c0.c;

/* loaded from: classes.dex */
public final class D {
    public static final D c = new D(false, false);
    public static final D d = new D(true, true);
    private final boolean a;
    private final boolean b;

    public D(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* renamed from: ۟ۧ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2430(Object obj) {
        if (C0058.m9131() < 0) {
            return ((D) obj).a;
        }
        return false;
    }

    /* renamed from: ۢ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2431(Object obj) {
        if (C0020.m4210() < 0) {
            return ((D) obj).b;
        }
        return false;
    }

    public final String a(String str) {
        String strM9640 = C0064.m9640(str);
        return !m2431(this) ? C0055.m8795(strM9640) : strM9640;
    }

    final c b(c cVar) {
        if (cVar != null && !m2431(this)) {
            C0000.m1094(cVar);
        }
        return cVar;
    }

    public final String c(String str) {
        String strM9640 = C0064.m9640(str);
        return !m2430(this) ? C0055.m8795(strM9640) : strM9640;
    }

    public final boolean d() {
        return m2431(this);
    }

    public final boolean e() {
        return m2430(this);
    }
}