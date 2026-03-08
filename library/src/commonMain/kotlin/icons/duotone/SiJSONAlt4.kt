package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiJSONAlt4: ImageVector
    get() {
        if (_SiJSONAlt4 != null) {
            return _SiJSONAlt4!!
        }
        _SiJSONAlt4 = ImageVector.Builder(
            name = "Duotone.SiJSONAlt4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 20f)
                horizontalLineToRelative(-0.184f)
                curveToRelative(-1.626f, -0.009f, -2.408f, -0.306f, -2.408f, -2.01f)
                verticalLineToRelative(-4.172f)
                curveToRelative(0f, -1.215f, -1.45f, -1.774f, -2.408f, -1.862f)
                verticalLineToRelative(-0.166f)
                curveToRelative(0.967f, -0.087f, 2.408f, -0.69f, 2.408f, -1.887f)
                verticalLineTo(6.01f)
                curveToRelative(0f, -1.695f, 0.782f, -2.001f, 2.408f, -2.01f)
                horizontalLineTo(7f)
                moveToRelative(10f, 16f)
                horizontalLineToRelative(0.184f)
                curveToRelative(1.626f, -0.009f, 2.408f, -0.306f, 2.408f, -2.01f)
                verticalLineToRelative(-4.172f)
                curveToRelative(0f, -1.215f, 1.45f, -1.774f, 2.408f, -1.862f)
                verticalLineToRelative(-0.166f)
                curveToRelative(-0.967f, -0.087f, -2.408f, -0.69f, -2.408f, -1.887f)
                verticalLineTo(6.01f)
                curveToRelative(0f, -1.695f, -0.782f, -2.001f, -2.408f, -2.01f)
                horizontalLineTo(17f)
                moveToRelative(-5.002f, 11f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.492f, 1.624f)
                quadToRelative(-0.3f, 0.876f, -0.662f, 1.73f)
                arcTo(39f, 39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.16f, 20f)
                moveTo(13f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
            }
        }.build()

        return _SiJSONAlt4!!
    }

@Suppress("ObjectPropertyName")
private var _SiJSONAlt4: ImageVector? = null
