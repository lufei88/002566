package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.F0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0145b {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f425short = {3004, 991, 979, 932, 2695, 821, 876, 873, 804};
    public final AbstractC0152i a;
    public final int b;
    public Q c;
    public int d;
    public final d0 e;

    public C0145b(C0145b c0145b, AbstractC0152i abstractC0152i, Q q, d0 d0Var) {
        this.a = abstractC0152i;
        this.b = C0012.m3044(c0145b);
        this.c = q;
        this.e = d0Var;
        this.d = C0020.m4213(c0145b);
    }

    public C0145b(AbstractC0152i abstractC0152i, int i, Q q) {
        this(abstractC0152i, i, q, C0058.m9087());
    }

    public C0145b(AbstractC0152i abstractC0152i, int i, Q q, d0 d0Var) {
        this.a = abstractC0152i;
        this.b = i;
        this.c = q;
        this.e = d0Var;
    }

    /* renamed from: ۟ۤۨۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m3862() {
        if (C0003.m1463() < 0) {
            return f425short;
        }
        return null;
    }

    public boolean a(C0145b c0145b) {
        Q qM8777;
        Q qM87772;
        if (this == c0145b) {
            return true;
        }
        return c0145b != null && C0055.m8704(C0047.m7799(this)) == C0055.m8704(C0047.m7799(c0145b)) && C0012.m3044(this) == C0012.m3044(c0145b) && ((qM8777 = C0055.m8777(this)) == (qM87772 = C0055.m8777(c0145b)) || (qM8777 != null && C0019.m4058(qM8777, qM87772))) && C0058.m9103(C0048.m7921(this), C0048.m7921(c0145b)) && C0056.m8930(this) == C0056.m8930(c0145b);
    }

    public final boolean b() {
        return (C0020.m4213(this) & 1073741824) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0145b) {
            return C0012.m2958(this, (C0145b) obj);
        }
        return false;
    }

    public int hashCode() {
        return C0043.m7334(C0031.m5632(C0031.m5632(C0059.m9238(C0059.m9238(7, C0055.m8704(C0047.m7799(this))), C0012.m3044(this)), C0055.m8777(this)), C0048.m7921(this)), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0046.m7718(m3862(), 0, 1, 2964));
        C0016.m3605(sb, C0047.m7799(this));
        String strM4795 = C0025.m4795(m3862(), 1, 1, 1011);
        C0018.m3933(sb, strM4795);
        C0036.m6177(sb, C0012.m3044(this));
        if (C0055.m8777(this) != null) {
            C0018.m3933(sb, C0039.m6551(m3862(), 2, 2, 1023));
            C0018.m3933(sb, C0037.m6312(C0055.m8777(this)));
            C0018.m3933(sb, C0060.m9352(m3862(), 4, 1, 2778));
        }
        d0 d0VarM7921 = C0048.m7921(this);
        if (d0VarM7921 != null && d0VarM7921 != C0058.m9087()) {
            C0018.m3933(sb, strM4795);
            C0016.m3605(sb, d0VarM7921);
        }
        if ((C0020.m4213(this) & (-1073741825)) > 0) {
            C0018.m3933(sb, C0039.m6551(m3862(), 5, 4, 793));
            C0036.m6177(sb, C0020.m4213(this) & (-1073741825));
        }
        C0062.m9399(sb, ')');
        return C0047.m7763(sb);
    }
}