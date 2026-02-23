package com.github.catvod.spider.merge.N0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public final class a {
    public static volatile b d = C0040.m6656();
    public final StringBuffer a;
    public final Object b;
    public final b c;

    public a(Object obj) {
        b bVarM8207 = C0051.m8207();
        StringBuffer stringBuffer = new StringBuffer(512);
        this.a = stringBuffer;
        this.c = bVarM8207;
        this.b = obj;
        if (obj == null) {
            C0047.m7777(bVarM8207);
            return;
        }
        if (C0007.m1808(bVarM8207)) {
            C0027.m4999(obj);
            C0051.m8251(stringBuffer, C0013.m3085(C0047.m7777(obj)));
        }
        if (C0025.m4823(bVarM8207)) {
            C0027.m4999(obj);
            C0018.m3884(stringBuffer, '@');
            C0051.m8251(stringBuffer, C0056.m8889(C0026.m4968(obj)));
        }
        C0051.m8251(stringBuffer, C0049.m8045(bVarM8207));
        if (C0014.m3316(bVarM8207)) {
            C0051.m8251(stringBuffer, C0036.m6242(bVarM8207));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r62 = this;
            r11 = r62
            r0 = 1
            com.github.catvod.spider.merge.N0.b r1 = com.github.catvod.spider.merge.Y.C0036.m6250(r11)
            java.lang.StringBuffer r2 = com.github.catvod.spider.merge.r0.C0059.m9196(r11)
            java.lang.Object r3 = com.github.catvod.spider.merge.P0.C0024.m4686(r11)
            if (r3 != 0) goto L1a
            java.lang.String r0 = com.github.catvod.spider.p000mergexbpq.r.C0014.m3359(r1)
            com.github.catvod.spider.merge.f.C0051.m8251(r2, r0)
            goto L9e
        L1a:
            java.lang.String r7 = com.github.catvod.spider.merge.Y.C0036.m6242(r1)
            int r4 = com.github.catvod.spider.p000mergexbpq.i.C0012.m2949()
            r5 = 0
            if (r2 == 0) goto L7f
            if (r7 != 0) goto L28
            goto L7f
        L28:
            int r4 = com.github.catvod.spider.p000mergexbpq.S.C0004.m1584(r7)
            int r6 = com.github.catvod.spider.merge.y0.C0064.m9641(r2)
            if (r4 <= r6) goto L33
            goto L82
        L33:
            int r4 = com.github.catvod.spider.merge.y0.C0064.m9641(r2)
            int r6 = com.github.catvod.spider.p000mergexbpq.S.C0004.m1584(r7)
            int r6 = r4 - r6
            int r9 = com.github.catvod.spider.p000mergexbpq.S.C0004.m1584(r7)
            boolean r4 = r2 instanceof java.lang.String
            r8 = 0
            if (r4 == 0) goto L52
            boolean r4 = r7 instanceof java.lang.String
            if (r4 == 0) goto L52
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = com.github.catvod.spider.merge.v.C0062.m9433(r4, r5, r6, r7, r8, r9)
            goto L7d
        L52:
            int r4 = com.github.catvod.spider.merge.S0.C0028.m5114(r2)
            int r4 = r4 - r6
            int r5 = com.github.catvod.spider.merge.S0.C0028.m5114(r7)
            r10 = 0
            if (r6 < 0) goto L7c
            if (r9 >= 0) goto L61
            goto L7c
        L61:
            if (r4 < r9) goto L7c
            if (r5 >= r9) goto L66
            goto L7c
        L66:
            int r4 = r9 + (-1)
            if (r9 <= 0) goto L7d
            int r5 = r6 + 1
            char r6 = com.github.catvod.spider.merge.b.C0044.m7511(r2, r6)
            int r9 = r8 + 1
            char r8 = com.github.catvod.spider.merge.b.C0044.m7511(r7, r8)
            if (r6 != r8) goto L7c
            r6 = r5
            r8 = r9
            r9 = r4
            goto L66
        L7c:
            r0 = 0
        L7d:
            r5 = r0
            goto L82
        L7f:
            if (r2 != r7) goto L7c
            goto L7d
        L82:
            if (r5 == 0) goto L94
            int r0 = com.github.catvod.spider.merge.y0.C0064.m9641(r2)
            java.lang.String r4 = com.github.catvod.spider.merge.Y.C0036.m6242(r1)
            int r4 = com.github.catvod.spider.p000mergexbpq.S.C0004.m1584(r4)
            int r0 = r0 - r4
            com.github.catvod.spider.p000mergexbpq.R.C0003.m1384(r2, r0)
        L94:
            java.lang.String r0 = com.github.catvod.spider.merge.Q0.C0026.m4974(r1)
            com.github.catvod.spider.merge.f.C0051.m8251(r2, r0)
            com.github.catvod.spider.merge.a0.C0042.m7171(r3)
        L9e:
            java.lang.String r0 = com.github.catvod.spider.merge.q.C0058.m9069(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.N0.a.toString():java.lang.String");
    }
}