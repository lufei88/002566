package com.github.catvod.spider.p000mergexbpq.P;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends c {
    public m(F f) {
        super(f);
    }

    /* renamed from: ۟۠ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static int m816(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((c) obj).c;
        }
        return 0;
    }

    /* renamed from: ۟ۢۥۦۧ, reason: not valid java name and contains not printable characters */
    public static void m817(Object obj) {
        if (C0037.m6350() < 0) {
            ((c) obj).m();
        }
    }

    /* renamed from: ۟ۢۧۤۦ, reason: not valid java name and contains not printable characters */
    public static D m818(Object obj, int i) {
        if (C0040.m6582() >= 0) {
            return ((m) obj).p(i);
        }
        return null;
    }

    /* renamed from: ۠۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m819(Object obj) {
        if (C0052.m8320() > 0) {
            return ((c) obj).b;
        }
        return null;
    }

    /* renamed from: ۤ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static int m820(Object obj) {
        if (C0036.m6252() > 0) {
            return ((c) obj).size();
        }
        return 0;
    }

    /* renamed from: ۣۤۢۢ, reason: not valid java name and contains not printable characters */
    public static int m821(Object obj, int i) {
        if (C0060.m9355() >= 0) {
            return ((c) obj).n(i);
        }
        return 0;
    }

    /* renamed from: ۤۦۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m822(Object obj, int i) {
        if (C0058.m9131() < 0) {
            return ((c) obj).o(i);
        }
        return false;
    }

    public final D e(int i) {
        m817(this);
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return m818(this, -i);
        }
        int iM816 = m816(this);
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = iM816 + 1;
            if (m822(this, i3)) {
                iM816 = m821(this, i3);
            }
        }
        return (D) C0028.m5167(m819(this), iM816);
    }

    protected final int k(int i) {
        return m821(this, i);
    }

    protected final D p(int i) {
        if (i != 0) {
            int iM816 = m816(this);
            if (iM816 - i >= 0) {
                for (int i2 = 1; i2 <= i && iM816 > 0; i2++) {
                    iM816--;
                    m822(this, iM816);
                    if (iM816 >= m820(this)) {
                        iM816 = m820(this) - 1;
                    } else {
                        while (iM816 >= 0) {
                            D d = (D) C0028.m5167(m819(this), iM816);
                            if (C0011.m2787(d) == -1 || C0024.m4685(d) == 0) {
                                break;
                            }
                            iM816--;
                        }
                    }
                }
                if (iM816 < 0) {
                    return null;
                }
                return (D) C0028.m5167(m819(this), iM816);
            }
        }
        return null;
    }
}