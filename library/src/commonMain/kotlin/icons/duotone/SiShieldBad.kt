package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiShieldBad: ImageVector
    get() {
        if (_SiShieldBad != null) {
            return _SiShieldBad!!
        }
        _SiShieldBad = ImageVector.Builder(
            name = "Duotone.SiShieldBad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
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
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(9.172f, 13.828f)
                lineTo(12f, 11f)
                moveToRelative(0f, 0f)
                lineToRelative(2.828f, -2.828f)
                moveTo(12f, 11f)
                lineToRelative(2.828f, 2.828f)
                moveTo(12f, 11f)
                lineTo(9.172f, 8.172f)
                moveTo(4f, 11.252f)
                curveToRelative(0f, 7.687f, 6.918f, 10.387f, 7.887f, 10.728f)
                quadToRelative(0.113f, 0.04f, 0.226f, 0f)
                curveTo(13.084f, 21.65f, 20f, 19.018f, 20f, 11.253f)
                verticalLineTo(4.304f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.303f, -0.389f)
                lineToRelative(-7.6f, -1.903f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.194f, 0f)
                lineToRelative(-7.6f, 1.903f)
                arcTo(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.304f)
                close()
            }
        }.build()

        return _SiShieldBad!!
    }

@Suppress("ObjectPropertyName")
private var _SiShieldBad: ImageVector? = null
