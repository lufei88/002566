package com.github.catvod.spider.p000mergexbpq.c0;

import com.github.catvod.spider.merge-xbpq.Z.a;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements Iterable<a>, Cloneable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f180short = {3030, 3017};
    private int c = 0;
    String[] d = new String[3];
    String[] e = new String[3];

    private void g(int i) {
        int i2 = i;
        C0017.m3716(i2 >= m2160(this));
        String[] strArrM2163 = m2163(this);
        int length = strArrM2163.length;
        if (length >= i2) {
            return;
        }
        int iM2160 = length >= 3 ? m2160(this) * 2 : 3;
        if (i2 <= iM2160) {
            i2 = iM2160;
        }
        this.d = (String[]) C0003.m1439(strArrM2163, i2);
        this.e = (String[]) C0003.m1439(m2165(this), i2);
    }

    private int p(String str) {
        C0023.m4613(str);
        for (int i = 0; i < m2160(this); i++) {
            if (C0000.m1057(str, m2163(this)[i])) {
                return i;
            }
        }
        return -1;
    }

    private boolean q(String str) {
        return str != null && C0004.m1584(str) > 1 && C0007.m1823(str, 0) == '/';
    }

    private void v(int i) {
        C0012.m3033(i >= m2160(this));
        int iM2160 = (m2160(this) - i) - 1;
        if (iM2160 > 0) {
            String[] strArrM2163 = m2163(this);
            int i2 = i + 1;
            C0062.m9384(strArrM2163, i2, strArrM2163, i, iM2160);
            String[] strArrM2165 = m2165(this);
            C0062.m9384(strArrM2165, i2, strArrM2165, i, iM2160);
        }
        int iM21602 = m2160(this) - 1;
        this.c = iM21602;
        m2163(this)[iM21602] = null;
        m2165(this)[iM21602] = null;
    }

    /* renamed from: ۟ۢۢ۠۠, reason: not valid java name and contains not printable characters */
    public static int m2160(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((c) obj).c;
        }
        return 0;
    }

    /* renamed from: ۣۣ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static int m2161(Object obj, Object obj2) {
        if (C0023.m4566() <= 0) {
            return ((c) obj).o((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m2162() {
        if (C0019.m4065() <= 0) {
            return f180short;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static String[] m2163(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((c) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۡۧۨ, reason: not valid java name and contains not printable characters */
    public static void m2164(Object obj, Object obj2, Object obj3) {
        if (C0061.m9359() < 0) {
            ((c) obj).n((Appendable) obj2, (g) obj3);
        }
    }

    /* renamed from: ۢۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String[] m2165(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((c) obj).e;
        }
        return null;
    }

    /* renamed from: ۣۢۡ, reason: not valid java name and contains not printable characters */
    public static void m2166(Object obj, Object obj2, Object obj3, boolean z, boolean z2, boolean z3) {
        if (C0039.m6529() <= 0) {
            n.d((Appendable) obj, (String) obj2, (g) obj3, z, z2, z3);
        }
    }

    /* renamed from: ۤۤۥۢ, reason: not valid java name and contains not printable characters */
    public static void m2167(Object obj, int i) {
        if (C0003.m1463() < 0) {
            ((c) obj).v(i);
        }
    }

    /* renamed from: ۥۡۦۣ, reason: contains not printable characters */
    public static boolean m2168(Object obj, Object obj2) {
        if (C0061.m9359() < 0) {
            return ((c) obj).q((String) obj2);
        }
        return false;
    }

    /* renamed from: ۥۣۤ۠, reason: contains not printable characters */
    public static void m2169(Object obj, int i) {
        if (C0033.m5872() > 0) {
            ((c) obj).g(i);
        }
    }

    /* renamed from: ۧ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2170(Object obj, Object obj2, Object obj3) {
        if (C0026.m4977() <= 0) {
            return a.c((String) obj, (String) obj2, (g) obj3);
        }
        return false;
    }

    /* renamed from: ۣۧۡۥ, reason: not valid java name and contains not printable characters */
    public static int m2171(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            return ((c) obj).p((String) obj2);
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return C0018.m3888(this);
    }

    public final c d(String str, String str2) {
        m2169(this, m2160(this) + 1);
        String[] strArrM2163 = m2163(this);
        int iM2160 = m2160(this);
        strArrM2163[iM2160] = str;
        m2165(this)[iM2160] = str2;
        this.c = iM2160 + 1;
        return this;
    }

    public final void e(c cVar) {
        if (C0020.m4225(cVar) == 0) {
            return;
        }
        m2169(this, m2160(this) + m2160(cVar));
        int i = 0;
        while (true) {
            if (i >= m2160(cVar) || !m2168(cVar, m2163(cVar)[i])) {
                if (!(i < m2160(cVar))) {
                    return;
                }
                a aVar = new a(m2163(cVar)[i], m2165(cVar)[i], cVar);
                i++;
                C0065.m9772(this, aVar);
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != C0047.m7777(obj)) {
            return false;
        }
        c cVar = (c) obj;
        if (m2160(this) == m2160(cVar) && C0037.m6347(m2163(this), m2163(cVar))) {
            return C0037.m6347(m2165(this), m2165(cVar));
        }
        return false;
    }

    public final List<a> f() {
        ArrayList arrayList = new ArrayList(m2160(this));
        for (int i = 0; i < m2160(this); i++) {
            if (!m2168(this, m2163(this)[i])) {
                C0004.m1532(arrayList, new a(m2163(this)[i], m2165(this)[i], this));
            }
        }
        return C0029.m5209(arrayList);
    }

    public final c h() {
        try {
            c cVar = (c) super.clone();
            cVar.c = m2160(this);
            this.d = (String[]) C0003.m1439(m2163(this), m2160(this));
            this.e = (String[]) C0003.m1439(m2165(this), m2160(this));
            return cVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        return (((m2160(this) * 31) + C0012.m2968(m2163(this))) * 31) + C0012.m2968(m2165(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(com.github.catvod.spider.p000mergexbpq.d0.D r59) {
        /*
            r58 = this;
            r8 = r59
            r7 = r58
            int r0 = m2160(r7)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L12
            return r2
        L12:
            boolean r8 = com.github.catvod.spider.p000mergexbpq.S.C0004.m1535(r8)
            r0 = 0
        L17:
            java.lang.String[] r3 = m2163(r7)
            int r3 = r3.length
            if (r2 >= r3) goto L54
            int r3 = r2 + 1
            r4 = r3
        L21:
            java.lang.String[] r5 = m2163(r7)
            int r6 = r5.length
            if (r4 >= r6) goto L52
            r6 = r5[r4]
            if (r6 != 0) goto L2d
            goto L52
        L2d:
            if (r8 == 0) goto L39
            r6 = r5[r2]
            r5 = r5[r4]
            boolean r5 = com.github.catvod.spider.p000mergexbpq.a0.C0007.m1815(r6, r5)
            if (r5 != 0) goto L49
        L39:
            if (r8 != 0) goto L50
            java.lang.String[] r5 = m2163(r7)
            r6 = r5[r2]
            r5 = r5[r4]
            boolean r5 = com.github.catvod.spider.p000mergexbpq.Q.C0000.m1057(r6, r5)
            if (r5 == 0) goto L50
        L49:
            int r0 = r0 + 1
            m2167(r7, r4)
            int r4 = r4 + (-1)
        L50:
            int r4 = r4 + r1
            goto L21
        L52:
            r2 = r3
            goto L17
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.p000mergexbpq.c0.c.i(com.github.catvod.spider.merge-xbpq.d0.D):int");
    }

    public final boolean isEmpty() {
        return m2160(this) == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<a> iterator() {
        return new b(this);
    }

    public final String j(String str) {
        String str2;
        int iM2161 = m2161(this, str);
        String strM1840 = C0007.m1840();
        return (iM2161 == -1 || (str2 = m2165(this)[iM2161]) == null) ? strM1840 : str2;
    }

    public final String k(String str) {
        String str2;
        int iM2171 = m2171(this, str);
        String strM1840 = C0007.m1840();
        return (iM2171 == -1 || (str2 = m2165(this)[iM2171]) == null) ? strM1840 : str2;
    }

    public final boolean l(String str) {
        return m2161(this, str) != -1;
    }

    public final boolean m(String str) {
        return m2171(this, str) != -1;
    }

    final void n(Appendable appendable, g gVar) {
        int iM2160 = m2160(this);
        for (int i = 0; i < iM2160; i++) {
            if (!m2168(this, m2163(this)[i])) {
                String str = m2163(this)[i];
                String strM1840 = m2165(this)[i];
                C0024.m4699(C0045.m7565(appendable, ' '), str);
                if (!m2170(str, strM1840, gVar)) {
                    C0024.m4699(appendable, C0057.m8978(m2162(), 0, 2, 3051));
                    if (strM1840 == null) {
                        strM1840 = C0007.m1840();
                    }
                    m2166(appendable, strM1840, gVar, true, false, false);
                    C0045.m7565(appendable, '\"');
                }
            }
        }
    }

    final int o(String str) {
        C0023.m4613(str);
        for (int i = 0; i < m2160(this); i++) {
            if (C0007.m1815(str, m2163(this)[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void r() {
        for (int i = 0; i < m2160(this); i++) {
            String[] strArrM2163 = m2163(this);
            strArrM2163[i] = C0055.m8795(strArrM2163[i]);
        }
    }

    public final c s(a aVar) {
        C0038.m6446(this, C0049.m7990(aVar), C0030.m5360(aVar));
        aVar.e = this;
        return this;
    }

    public final int size() {
        int i = 0;
        for (int i2 = 0; i2 < m2160(this); i2++) {
            if (!m2168(this, m2163(this)[i2])) {
                i++;
            }
        }
        return i;
    }

    public final c t(String str, String str2) {
        C0023.m4613(str);
        int iM2161 = m2161(this, str);
        if (iM2161 != -1) {
            m2165(this)[iM2161] = str2;
        } else {
            C0056.m8932(this, str, str2);
        }
        return this;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.github.catvod.spider.merge-xbpq.Z.a */
    public final String toString() throws a {
        StringBuilder sbM9299 = C0060.m9299();
        try {
            m2164(this, sbM9299, C0045.m7613(new h()));
            return C0026.m4919(sbM9299);
        } catch (IOException e) {
            throw new a(e);
        }
    }

    final void u(String str, String str2) {
        int iM2171 = m2171(this, str);
        if (iM2171 == -1) {
            C0056.m8932(this, str, str2);
            return;
        }
        m2165(this)[iM2171] = str2;
        if (C0007.m1815(m2163(this)[iM2171], str)) {
            return;
        }
        m2163(this)[iM2171] = str;
    }
}