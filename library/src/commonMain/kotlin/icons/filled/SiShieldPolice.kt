package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiShieldPolice: ImageVector
    get() {
        if (_SiShieldPolice != null) {
            return _SiShieldPolice!!
        }
        _SiShieldPolice = ImageVector.Builder(
            name = "Filled.SiShieldPolice",
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
                moveToRelative(2.334f, -10.045f)
                lineToRelative(2.652f, -2.147f)
                curveToRelative(0.063f, -0.126f, 0.126f, -0.252f, 0.126f, -0.379f)
                curveToRelative(-0.063f, -0.126f, -0.19f, -0.252f, -0.316f, -0.252f)
                horizontalLineToRelative(-3.283f)
                lineToRelative(-1.073f, -2.904f)
                curveToRelative(-0.063f, -0.127f, -0.19f, -0.253f, -0.316f, -0.253f)
                reflectiveCurveToRelative(-0.252f, 0.126f, -0.315f, 0.253f)
                lineToRelative(-1.01f, 2.904f)
                horizontalLineTo(7.34f)
                curveToRelative(-0.126f, 0f, -0.252f, 0.126f, -0.315f, 0.252f)
                arcToRelative(0.304f, 0.304f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.126f, 0.38f)
                lineTo(9.74f, 11.87f)
                lineToRelative(-0.821f, 3.157f)
                arcToRelative(0.304f, 0.304f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.126f, 0.379f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.379f, 0f)
                lineToRelative(2.652f, -1.894f)
                lineToRelative(2.588f, 1.894f)
                curveToRelative(0.063f, 0.063f, 0.126f, 0.063f, 0.19f, 0.063f)
                curveToRelative(0.063f, 0f, 0.126f, 0f, 0.189f, -0.063f)
                arcToRelative(0.304f, 0.304f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.126f, -0.379f)
                close()
            }
        }.build()

        return _SiShieldPolice!!
    }

@Suppress("ObjectPropertyName")
private var _SiShieldPolice: ImageVector? = null
