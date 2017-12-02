//
//  AdOceanConfig.h
//  GemiusSDK
//
//  Copyright (c) 2016 Gemius. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface GEMAdOceanConfig : NSObject
@property(nonatomic, strong) NSString   *emitterHost;
+ (GEMAdOceanConfig*)sharedInstance;
@end
