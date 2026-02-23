package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public class f0 extends Q {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f430short = {1895, 2650};
    public final Q c;
    public final int d;

    public f0(Q q, int i) {
        super(q != null ? C0043.m7334(C0059.m9238(C0031.m5632(1, q), i), 2) : C0043.m7334(1, 0));
        this.c = q;
        this.d = i;
    }

    public static f0 i(Q q, int i) {
        return (i == Integer.MAX_VALUE && q == null) ? C0041.m6743() : new f0(q, i);
    }

    /* renamed from: ۣ۟ۦۥ۟, reason: not valid java name and contains not printable characters */
    public static short[] m3867() {
        if (C0014.m3353() < 0) {
            return f430short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.Q
    public Q c(int i) {
        return C0056.m8944(this);
    }

    @Override // com.github.catvod.spider.merge.F0.Q
    public int d(int i) {
        return C0021.m4322(this);
    }

    @Override // com.github.catvod.spider.merge.F0.Q
    public boolean equals(Object obj) {
        Q qM8944;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        if (C0000.m1111(this) != C0000.m1111((Q) obj)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return C0021.m4322(this) == C0021.m4322(f0Var) && (qM8944 = C0056.m8944(this)) != null && C0019.m4058(qM8944, C0056.m8944(f0Var));
    }

    @Override // com.github.catvod.spider.merge.F0.Q
    public int h() {
        return 1;
    }

    public String toString() {
        Q qM8944 = C0056.m8944(this);
        String strM6312 = qM8944 != null ? C0037.m6312(qM8944) : C0007.m1840();
        int iM1584 = C0004.m1584(strM6312);
        int iM4322 = C0021.m4322(this);
        if (iM1584 == 0) {
            return iM4322 == Integer.MAX_VALUE ? C0052.m8337(m3867(), 0, 1, 1859) : C0054.m8599(iM4322);
        }
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0054.m8599(iM4322));
        C0018.m3933(sb, C0060.m9352(m3867(), 1, 1, 2682));
        C0018.m3933(sb, strM6312);
        return C0047.m7763(sb);
    }
}