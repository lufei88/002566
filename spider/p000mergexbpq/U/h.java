package com.github.catvod.spider.p000mergexbpq.U;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h {
    public static final /* synthetic */ int a = 0;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f167short = {1066, 1030, 1037, 1087, 1048, 1077, 1049, 1051, 1044, 1055, 1048, 1055, 1048, 1041, 1074, 1055, 1047, 1045, 1028, 1055, 1026, 1055, 1045, 1047, 1050, 1083, 1047, 1028, 1053, 1029, 1035, 1117};

    static {
        C0005.m1602(C0055.m8814(m1685(), 0, 32, 1142));
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (C0028.m5114(charSequence2) > C0028.m5114(charSequence)) {
            return false;
        }
        return m1684(charSequence, false, C0028.m5114(charSequence) - C0028.m5114(charSequence2), charSequence2, C0028.m5114(charSequence2));
    }

    public static boolean b(CharSequence charSequence) {
        int iM5114 = charSequence == null ? 0 : C0028.m5114(charSequence);
        if (iM5114 == 0) {
            return true;
        }
        for (int i = 0; i < iM5114; i++) {
            if (!C0005.m1617(C0044.m7511(charSequence, i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || C0028.m5114(charSequence) == 0;
    }

    public static boolean d(CharSequence charSequence) {
        return !C0003.m1449(charSequence);
    }

    public static String e(Iterable<?> iterable, String str) {
        Iterator itM7890;
        Object objM7949;
        if (iterable == null || (itM7890 = C0048.m7890(iterable)) == null) {
            return null;
        }
        if (C0012.m2962(itM7890)) {
            Object objM79492 = C0048.m7949(itM7890);
            if (C0012.m2962(itM7890)) {
                StringBuilder sb = new StringBuilder(256);
                if (objM79492 == null) {
                    C0016.m3605(sb, objM79492);
                    while (C0012.m2962(itM7890)) {
                        if (str != null) {
                            C0018.m3933(sb, str);
                        }
                        objM7949 = C0048.m7949(itM7890);
                        if (objM7949 != null) {
                        }
                    }
                    return C0047.m7763(sb);
                }
                C0016.m3605(sb, objM7949);
            } else if (objM79492 != null) {
                return C0037.m6312(objM79492);
            }
        }
        return C0007.m1840();
    }

    public static String f(String str, String str2) {
        return (C0009.m2084(str) || C0009.m2084(str2) || !C0060.m9349(str, str2)) ? str : C0054.m8636(str, 0, C0004.m1584(str) - C0004.m1584(str2));
    }

    public static String g(String str, String str2) {
        return (C0009.m2084(str) || C0009.m2084(str2) || !C0043.m7277(str, str2)) ? str : C0056.m8890(str, C0004.m1584(str2));
    }

    public static String h(String str, String str2, String str3) {
        if (C0009.m2084(str) || C0009.m2084(str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int iM1683 = (str == null || str2 == null) ? -1 : m1683(str, str2, 0);
        if (iM1683 == -1) {
            return str;
        }
        int iM1584 = C0004.m1584(str2);
        StringBuilder sb = new StringBuilder(C0004.m1584(str) + (C0008.m1965(C0004.m1584(str3) - iM1584, 0) * 16));
        int i2 = -1;
        while (iM1683 != -1) {
            C0057.m8977(sb, str, i, iM1683);
            C0018.m3933(sb, str3);
            i = iM1683 + iM1584;
            i2--;
            if (i2 == 0) {
                break;
            }
            iM1683 = m1683(str, str2, i);
        }
        C0057.m8977(sb, str, i, C0004.m1584(str));
        return C0047.m7763(sb);
    }

    public static String i(String str, int i) {
        int iM1584 = i;
        if (str == null) {
            return null;
        }
        if (iM1584 < 0) {
            iM1584 += C0004.m1584(str);
        }
        if (iM1584 < 0) {
            iM1584 = 0;
        }
        return iM1584 > C0004.m1584(str) ? C0007.m1840() : C0056.m8890(str, iM1584);
    }

    public static String j(String str, int i, int i2) {
        int iM1584 = i2;
        int iM15842 = i;
        if (str == null) {
            return null;
        }
        if (iM1584 < 0) {
            iM1584 += C0004.m1584(str);
        }
        if (iM15842 < 0) {
            iM15842 += C0004.m1584(str);
        }
        if (iM1584 > C0004.m1584(str)) {
            iM1584 = C0004.m1584(str);
        }
        if (iM15842 > iM1584) {
            return C0007.m1840();
        }
        if (iM15842 < 0) {
            iM15842 = 0;
        }
        if (iM1584 < 0) {
            iM1584 = 0;
        }
        return C0054.m8636(str, iM15842, iM1584);
    }

    /* renamed from: ۟۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static int m1683(Object obj, Object obj2, int i) {
        if (C0029.m5282() > 0) {
            return a.a((CharSequence) obj, (CharSequence) obj2, i);
        }
        return 0;
    }

    /* renamed from: ۣۢۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m1684(Object obj, boolean z, int i, Object obj2, int i2) {
        if (C0020.m4210() <= 0) {
            return a.b((CharSequence) obj, z, i, (CharSequence) obj2, i2);
        }
        return false;
    }

    /* renamed from: ۥۡۦۨ, reason: contains not printable characters */
    public static short[] m1685() {
        if (C0002.m1242() >= 0) {
            return f167short;
        }
        return null;
    }
}