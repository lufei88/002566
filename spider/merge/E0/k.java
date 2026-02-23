package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class k extends s implements t {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f399short = {1210, 1185, 1189, 1195, 1184, 1262, 1212, 1195, 1197, 1185, 1193, 1184, 1191, 1210, 1191, 1185, 1184, 1262, 1195, 1212, 1212, 1185, 1212, 1262, 1199, 1210, 1268, 1262, 1257, 1002, 984, 317, 277, 3049, 3015, 1840, 1865, 1859, 1866, 1842, 1666, 851, 850, 859, 850, 848, 854, 835, 850, 836};
    public final c d;
    public final com.github.catvod.spider.merge.H0.h e;
    public d g;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public final e f = C0038.m6391();
    public int h = -1;
    public final com.github.catvod.spider.merge.H0.d n = new com.github.catvod.spider.merge.H0.d();
    public int o = 0;

    public k(c cVar) {
        this.d = cVar;
        this.e = new com.github.catvod.spider.merge.H0.h(this, cVar);
    }

    /* renamed from: ۟ۥۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m3784() {
        if (C0003.m1463() < 0) {
            return f399short;
        }
        return null;
    }

    public final void c(l lVar) {
        int iM8296 = C0052.m8296(this);
        c cVarM3357 = C0014.m3357(this);
        String strM8179 = C0051.m8179(cVarM3357, C0059.m9209(iM8296, C0051.m8228(cVarM3357)));
        StringBuilder sb = new StringBuilder(C0039.m6551(m3784(), 0, 29, 1230));
        StringBuilder sb2 = new StringBuilder();
        for (char c : C0019.m4078(strM8179)) {
            String strM8763 = C0055.m8763(c);
            if (c == 65535) {
                strM8763 = C0016.m3525(m3784(), 35, 5, 1804);
            } else if (c == '\r') {
                strM8763 = C0034.m6001(m3784(), 33, 2, 2997);
            } else if (c == '\t') {
                strM8763 = C0017.m3646(m3784(), 31, 2, 353);
            } else if (c == '\n') {
                strM8763 = C0013.m3106(m3784(), 29, 2, 950);
            }
            C0018.m3933(sb2, strM8763);
        }
        C0018.m3933(sb, C0047.m7763(sb2));
        C0018.m3933(sb, C0036.m6188(m3784(), 40, 1, 1701));
        String strM7763 = C0047.m7763(sb);
        r rVarM8279 = C0051.m8279(this);
        if (rVarM8279 == null) {
            throw new NullPointerException(C0012.m2973(m3784(), 41, 9, 823));
        }
        int iM9751 = C0065.m9751(this);
        int iM8404 = C0053.m8404(this);
        Iterator itM1943 = C0008.m1943(rVarM8279);
        while (C0012.m2962(itM1943)) {
            C0055.m8800((g) C0048.m7949(itM1943), this, null, iM9751, iM8404, strM7763, lVar);
        }
    }
}