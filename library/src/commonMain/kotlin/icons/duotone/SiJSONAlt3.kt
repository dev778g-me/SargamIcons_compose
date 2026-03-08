package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiJSONAlt3: ImageVector
    get() {
        if (_SiJSONAlt3 != null) {
            return _SiJSONAlt3!!
        }
        _SiJSONAlt3 = ImageVector.Builder(
            name = "Duotone.SiJSONAlt3",
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
                moveTo(11.998f, 15f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.492f, 1.624f)
                quadToRelative(-0.3f, 0.876f, -0.662f, 1.73f)
                arcTo(39f, 39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.16f, 20f)
                moveTo(6.835f, 4f)
                quadToRelative(-0.747f, 0.022f, -1.297f, 0.242f)
                arcToRelative(1.86f, 1.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.857f, 0.66f)
                quadToRelative(-0.285f, 0.438f, -0.285f, 1.164f)
                verticalLineTo(9.23f)
                quadToRelative(0f, 1.12f, -0.594f, 1.802f)
                quadToRelative(-0.593f, 0.66f, -1.802f, 0.88f)
                verticalLineToRelative(0.131f)
                quadToRelative(1.23f, 0.22f, 1.802f, 0.901f)
                quadToRelative(0.594f, 0.66f, 0.594f, 1.78f)
                verticalLineToRelative(3.231f)
                quadToRelative(0f, 0.704f, 0.285f, 1.143f)
                quadToRelative(0.286f, 0.461f, 0.835f, 0.66f)
                quadToRelative(0.55f, 0.219f, 1.32f, 0.241f)
                moveTo(17.164f, 4f)
                quadToRelative(0.747f, 0.022f, 1.297f, 0.242f)
                quadToRelative(0.55f, 0.219f, 0.857f, 0.66f)
                quadToRelative(0.285f, 0.438f, 0.285f, 1.164f)
                verticalLineTo(9.23f)
                quadToRelative(0f, 1.12f, 0.594f, 1.802f)
                quadToRelative(0.593f, 0.66f, 1.802f, 0.88f)
                verticalLineToRelative(0.131f)
                quadToRelative(-1.23f, 0.22f, -1.802f, 0.901f)
                quadToRelative(-0.594f, 0.66f, -0.594f, 1.78f)
                verticalLineToRelative(3.231f)
                quadToRelative(0f, 0.704f, -0.285f, 1.143f)
                quadToRelative(-0.286f, 0.461f, -0.835f, 0.66f)
                quadToRelative(-0.55f, 0.219f, -1.32f, 0.241f)
                moveTo(13f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
            }
        }.build()

        return _SiJSONAlt3!!
    }

@Suppress("ObjectPropertyName")
private var _SiJSONAlt3: ImageVector? = null
