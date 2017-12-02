//
//  NetpanelConfig.h
//  GemiusSDK
//
//  Copyright (c) 2016 Gemius. All rights reserved.
//

#import "BaseConfig.h"

@interface GEMNetpanelConfig : GEMBaseConfig

@property(nonatomic, strong)NSString    *netpanelUID;

+(void)sendBufferedEvents;
+(GEMNetpanelConfig*)sharedInstance;

@end
