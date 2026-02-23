package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f383short = {1191, 1184, 1164, 1159, 1199, 1171, 1153, 1184, 1164, 1159, 1215, 1170, 1153, 1185, 1152, 1191, -9024, 1233, -9022, 1185, 1191, -9988, 1233, -9469, 1185, 1152, -9023, 1191, -9988, 1233, -9549, -9604, 1233, -9725, 1185, 1152, -9022, 1191, -9732, 1233, -9981, 1185, 1152, 1191, 8956, 1233, 9027, 1185, 1152, 1191, 12284, 1233, 12035, 1185, 1152, 1191, 13516, 1233, 13507, 1185, 1152, 1191, -1284, 1233, -1293, 1185, 1152, 9457, 11188};
    public static final Pattern a = C0005.m1602(C0060.m9352(m3730(), 0, 68, 1276));

    public static String a(String str) {
        if (str == null || C0057.m8953(str)) {
            return str;
        }
        Matcher matcherM6026 = C0034.m6026(C0032.m5727(), C0035.m6089(str, C0041.m6828()));
        String strM1840 = C0007.m1840();
        return C0015.m3446(C0005.m1623(matcherM6026, strM1840), C0039.m6551(m3730(), 68, 1, 3001), strM1840);
    }

    /* renamed from: ۟ۦۡۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m3730() {
        if (C0017.m3633() <= 0) {
            return f383short;
        }
        return null;
    }
}