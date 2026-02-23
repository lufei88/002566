package com.github.catvod.spider.merge.b0;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h0.O;
import com.github.catvod.spider.merge.h0.T;
import com.github.catvod.spider.merge.o0.C0056;
import java.io.File;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (C0023.m4556(this)) {
            case 0:
                int iM6456 = C0038.m6456(C0056.m8890((String) obj, 2));
                int iM64562 = C0038.m6456(C0056.m8890((String) obj2, 2));
                if (iM6456 == iM64562) {
                    return 0;
                }
                return iM6456 < iM64562 ? -1 : 1;
            case 1:
                return C0050.m8124(C0038.m6412((File) obj), C0038.m6412((File) obj2));
            case 2:
                int iM5713 = C0032.m5713((O) obj);
                int iM57132 = C0032.m5713((O) obj2);
                if (iM5713 == iM57132) {
                    return 0;
                }
                return iM5713 < iM57132 ? -1 : 1;
            default:
                int iM8192 = C0051.m8192((T) obj);
                int iM81922 = C0051.m8192((T) obj2);
                if (iM8192 == iM81922) {
                    return 0;
                }
                return iM8192 < iM81922 ? -1 : 1;
        }
    }
}