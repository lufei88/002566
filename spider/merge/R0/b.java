package com.github.catvod.spider.merge.R0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends IllegalArgumentException {
    public static final String a = C0013.m3085(com.github.catvod.spider.merge.A0.b.class);

    public b(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        try {
            super.fillInStackTrace();
            StackTraceElement[] stackTraceElementArrM1275 = C0002.m1275(this);
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTraceElementArrM1275) {
                if (!C0007.m1815(C0062.m9394(stackTraceElement), C0015.m3482())) {
                    C0004.m1532(arrayList, stackTraceElement);
                }
            }
            C0042.m7103(this, (StackTraceElement[]) C0018.m3904(arrayList, new StackTraceElement[0]));
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}