package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends Exception {
    public final i a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        i iVarM8752 = C0055.m8752();
        this.a = iVarM8752;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, IOException iOException) {
        super(str, iOException);
        i iVarM8573 = C0054.m8573();
        this.a = iVarM8573;
    }

    public final i a() {
        return C0027.m5048(this);
    }
}