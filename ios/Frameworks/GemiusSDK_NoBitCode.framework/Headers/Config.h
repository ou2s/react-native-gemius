//
//  Config.h
//  GemiusSDK
//
//  Copyright (c) 2016 Gemius. All rights reserved.
//

#import <UIKit/UIKit.h>

#define GEM_SDK_NAME                                @"GemiusSDK"
#define GEM_SDK_VERSION                             @"1.2.6"

@interface GEMConfig : NSObject
@property(nonatomic, assign) BOOL       loggingEnabled;
@property(nonatomic, assign) BOOL       cookiesAllowed;
@property(nonatomic, strong) NSString   *oldCookiePath;

+ (GEMConfig*)sharedInstance;

+ (NSString*)getSdkVersion;
- (void)setAppInfo:(NSString*)name version:(NSString*)version;
- (NSString*)getUA4WebView;
@end
