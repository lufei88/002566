package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Z0.c;
import com.github.catvod.spider.merge.Z0.d;
import com.github.catvod.spider.merge.Z0.e;
import com.github.catvod.spider.merge.Z0.f;
import com.github.catvod.spider.merge.Z0.g;
import com.github.catvod.spider.merge.Z0.h;
import com.github.catvod.spider.merge.Z0.i;
import com.github.catvod.spider.merge.Z0.j;
import com.github.catvod.spider.merge.Z0.k;
import com.github.catvod.spider.merge.Z0.l;
import com.github.catvod.spider.merge.Z0.m;
import com.github.catvod.spider.merge.Z0.n;
import com.github.catvod.spider.merge.a1.o;
import com.github.catvod.spider.merge.a1.p;
import com.github.catvod.spider.merge.a1.q;
import com.github.catvod.spider.merge.e1.b;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();
    public static final HashMap c = new HashMap();
    public static final b d = C0063.m9538(a.class);

    static {
        int i = 17;
        int i2 = 14;
        Class[] clsArr = {com.github.catvod.spider.merge.Z0.a.class, com.github.catvod.spider.merge.Z0.b.class, c.class, d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, l.class, m.class, n.class};
        int i3 = 0;
        while (i3 < i2) {
            try {
                C0022.m4478(m7973(clsArr[i3]));
                throw null;
            } catch (Exception e) {
                C0029.m5220(C0055.m8794(), C0005.m1621(e), e);
                i3++;
                i = 17;
                i2 = 14;
            }
        }
        Class[] clsArr2 = new Class[i];
        clsArr2[0] = com.github.catvod.spider.merge.a1.a.class;
        clsArr2[1] = com.github.catvod.spider.merge.a1.b.class;
        clsArr2[2] = com.github.catvod.spider.merge.a1.c.class;
        clsArr2[3] = com.github.catvod.spider.merge.a1.d.class;
        clsArr2[4] = com.github.catvod.spider.merge.a1.f.class;
        clsArr2[5] = com.github.catvod.spider.merge.a1.g.class;
        clsArr2[6] = com.github.catvod.spider.merge.a1.h.class;
        clsArr2[7] = com.github.catvod.spider.merge.a1.i.class;
        clsArr2[8] = com.github.catvod.spider.merge.a1.j.class;
        clsArr2[9] = com.github.catvod.spider.merge.a1.k.class;
        clsArr2[10] = com.github.catvod.spider.merge.a1.l.class;
        clsArr2[11] = com.github.catvod.spider.merge.a1.n.class;
        clsArr2[12] = p.class;
        clsArr2[13] = com.github.catvod.spider.merge.a1.e.class;
        clsArr2[i2] = com.github.catvod.spider.merge.a1.m.class;
        clsArr2[15] = o.class;
        clsArr2[16] = q.class;
        for (int i4 = 0; i4 < i; i4++) {
            try {
                C0022.m4478(m7973(clsArr2[i4]));
                throw null;
            } catch (Exception e2) {
                C0029.m5220(C0055.m8794(), C0005.m1621(e2), e2);
            }
        }
        Class[] clsArr3 = {com.github.catvod.spider.merge.b1.a.class, com.github.catvod.spider.merge.b1.b.class, com.github.catvod.spider.merge.b1.c.class, com.github.catvod.spider.merge.b1.d.class, com.github.catvod.spider.merge.b1.e.class, com.github.catvod.spider.merge.b1.f.class};
        for (int i5 = 0; i5 < 6; i5++) {
            try {
                C0022.m4478(m7973(clsArr3[i5]));
                throw null;
            } catch (Exception e3) {
                C0029.m5220(C0055.m8794(), C0005.m1621(e3), e3);
            }
        }
    }

    /* renamed from: ۨۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Object m7973(Object obj) {
        if (C0057.m9017() > 0) {
            return ((Class) obj).newInstance();
        }
        return null;
    }
}