package com.github.catvod.spider.merge.n0;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;

/* renamed from: com.github.catvod.spider.merge.n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355a extends Error {
    public final Exception a;

    public C0355a(String str, Exception exc) {
        super(str);
        this.a = exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Exception excM5385;
        String message = super.getMessage();
        if (message != null || (excM5385 = C0030.m5385(this)) == null) {
            return message;
        }
        String strM6261 = C0036.m6261(excM5385);
        return strM6261 == null ? C0036.m6180(C0047.m7777(excM5385)) : strM6261;
    }
}