package com.github.catvod.spider.p000mergexbpq.x;

import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f366short = {648, 687, 679, 674, 699, 700, 683, 742};
    public final Throwable c;

    public f(Throwable th) {
        this.c = th;
    }

    /* renamed from: ۟ۤ۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static short[] m3404() {
        if (C0003.m1463() < 0) {
            return f366short;
        }
        return null;
    }

    /* renamed from: ۥۣۤۥ, reason: contains not printable characters */
    public static boolean m3405(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            return com.github.catvod.spider.merge-xbpq.E.f.a(obj, obj2);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && m3405(C0026.m4933(this), C0026.m4933((f) obj));
    }

    public final int hashCode() {
        return C0050.m8087(C0026.m4933(this));
    }

    public final String toString() {
        StringBuilder sbM7166 = C0042.m7166(C0031.m5565(m3404(), 0, 8, 718));
        C0016.m3605(sbM7166, C0026.m4933(this));
        C0062.m9399(sbM7166, ')');
        return C0047.m7763(sbM7166);
    }
}