package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiShieldPolice: ImageVector
    get() {
        if (_SiShieldPolice != null) {
            return _SiShieldPolice!!
        }
        _SiShieldPolice = ImageVector.Builder(
            name = "Regular.SiShieldPolice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.113f, 21.98f)
                arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.226f, 0f)
                curveTo(10.917f, 21.64f, 4f, 18.94f, 4f, 11.252f)
                verticalLineTo(4.304f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.303f, -0.389f)
                lineToRelative(7.6f, -1.903f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.194f, 0f)
                lineToRelative(7.6f, 1.903f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.303f, 0.389f)
                verticalLineToRelative(6.948f)
                curveToRelative(0f, 7.765f, -6.916f, 10.397f, -7.887f, 10.729f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(16.874f, 9.788f)
                lineToRelative(-2.652f, 2.147f)
                lineToRelative(0.947f, 3.093f)
                arcToRelative(0.304f, 0.304f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.126f, 0.379f)
                curveToRelative(-0.063f, 0.063f, -0.126f, 0.063f, -0.19f, 0.063f)
                curveToRelative(-0.063f, 0f, -0.126f, 0f, -0.189f, -0.063f)
                lineToRelative(-2.588f, -1.894f)
                lineToRelative(-2.652f, 1.894f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.379f, 0f)
                arcToRelative(0.304f, 0.304f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.126f, -0.379f)
                lineToRelative(0.82f, -3.157f)
                lineToRelative(-2.588f, -2.083f)
                arcToRelative(0.304f, 0.304f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.126f, -0.379f)
                curveToRelative(0.063f, -0.126f, 0.19f, -0.252f, 0.315f, -0.252f)
                horizontalLineToRelative(3.347f)
                lineToRelative(1.01f, -2.904f)
                curveToRelative(0.063f, -0.127f, 0.19f, -0.253f, 0.315f, -0.253f)
                curveToRelative(0.127f, 0f, 0.253f, 0.126f, 0.316f, 0.253f)
                lineToRelative(1.073f, 2.904f)
                horizontalLineToRelative(3.283f)
                curveToRelative(0.127f, 0f, 0.253f, 0.126f, 0.316f, 0.252f)
                curveToRelative(0f, 0.127f, -0.063f, 0.253f, -0.126f, 0.38f)
                close()
            }
        }.build()

        return _SiShieldPolice!!
    }

@Suppress("ObjectPropertyName")
private var _SiShieldPolice: ImageVector? = null
