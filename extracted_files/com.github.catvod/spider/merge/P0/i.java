package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class i extends j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f483short = {3137, 3130, 3089, 3072, 3093, 3093, 3076, 3091, 3087, 3164, 834};
    public Pattern a;

    /* renamed from: ۧۤۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m4639() {
        if (C0003.m1463() <= 0) {
            return f483short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.P0.j
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.P0.j
    public final boolean b(n nVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        Matcher matcherM6026 = C0034.m6026(C0053.m8402(this), C0056.m8890(str, C0007.m1829(parsePosition)));
        if (!C0029.m5203(matcherM6026)) {
            C0035.m6091(parsePosition, C0007.m1829(parsePosition));
            return false;
        }
        C0015.m3487(parsePosition, C0029.m5268(matcherM6026, 1) + C0007.m1829(parsePosition));
        C0040.m6591(this, calendar, C0021.m4306(matcherM6026, 1));
        return true;
    }

    public abstract void c(Calendar calendar, String str);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0008.m2013(C0047.m7777(this)));
        C0018.m3933(sb, C0040.m6584(m4639(), 0, 10, 3169));
        C0016.m3605(sb, C0053.m8402(this));
        C0018.m3933(sb, C0021.m4340(m4639(), 10, 1, 799));
        return C0047.m7763(sb);
    }
}