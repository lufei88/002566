package com.github.catvod.spider.merge.M0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class d {
    public static final /* synthetic */ int a = 0;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f469short = {3228, 3248, 3259, 3209, 3246, 3203, 3247, 3245, 3234, 3241, 3246, 3241, 3246, 3239, 3204, 3241, 3233, 3235, 3250, 3241, 3252, 3241, 3235, 3233, 3244, 3213, 3233, 3250, 3243, 3251, 3261, 3307};

    static {
        C0005.m1602(C0056.m8911(m4531(), 0, 32, 3264));
    }

    public static boolean a(CharSequence... charSequenceArr) {
        if (C0059.m9234(charSequenceArr) == 0) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (!C0003.m1430(charSequence)) {
                return false;
            }
        }
        return true;
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

    public static boolean d(CharSequence... charSequenceArr) {
        boolean z = false;
        if (!(C0059.m9234(charSequenceArr) == 0)) {
            int length = charSequenceArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (C0003.m1430(charSequenceArr[i])) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        return !z;
    }

    public static String e(Iterable iterable, String str) {
        Iterator itM7890;
        if (iterable == null || (itM7890 = C0048.m7890(iterable)) == null) {
            return null;
        }
        boolean zM2962 = C0012.m2962(itM7890);
        String strM1840 = C0007.m1840();
        if (zM2962) {
            Object objM7949 = C0048.m7949(itM7890);
            if (C0012.m2962(itM7890)) {
                StringBuilder sb = new StringBuilder(256);
                if (objM7949 != null) {
                    C0016.m3605(sb, objM7949);
                }
                while (C0012.m2962(itM7890)) {
                    C0018.m3933(sb, str);
                    Object objM79492 = C0048.m7949(itM7890);
                    if (objM79492 != null) {
                        C0016.m3605(sb, objM79492);
                    }
                }
                return C0047.m7763(sb);
            }
            if (objM7949 != null) {
                return C0037.m6312(objM7949);
            }
        }
        return strM1840;
    }

    public static String f(String str, String str2) {
        return (C0003.m1433(str) || C0003.m1433(str2) || !C0060.m9349(str, str2)) ? str : C0054.m8636(str, 0, C0004.m1584(str) - C0004.m1584(str2));
    }

    /* renamed from: ۣ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m4531() {
        if (C0000.m1116() <= 0) {
            return f469short;
        }
        return null;
    }
}