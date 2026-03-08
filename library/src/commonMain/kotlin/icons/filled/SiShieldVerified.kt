package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiShieldVerified: ImageVector
    get() {
        if (_SiShieldVerified != null) {
            return _SiShieldVerified!!
        }
        _SiShieldVerified = ImageVector.Builder(
            name = "Filled.SiShieldVerified",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.888f, 21.98f)
                quadToRelative(0.113f, 0.04f, 0.225f, 0f)
                curveTo(13.084f, 21.65f, 20f, 19.018f, 20f, 11.253f)
                verticalLineTo(4.304f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.303f, -0.389f)
                lineToRelative(-7.6f, -1.903f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.194f, 0f)
                lineToRelative(-7.6f, 1.903f)
                arcTo(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.304f)
                verticalLineToRelative(6.948f)
                curveToRelative(0f, 7.687f, 6.918f, 10.387f, 7.887f, 10.728f)
                moveTo(16.813f, 8.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.628f, -1.162f)
                lineToRelative(-4.314f, 6.04f)
                lineToRelative(-2.165f, -2.166f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 1.414f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.52f, -0.126f)
                close()
            }
        }.build()

        return _SiShieldVerified!!
    }

@Suppress("ObjectPropertyName")
private var _SiShieldVerified: ImageVector? = null
