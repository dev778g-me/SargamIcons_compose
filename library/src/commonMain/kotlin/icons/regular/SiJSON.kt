package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiJSON: ImageVector
    get() {
        if (_SiJSON != null) {
            return _SiJSON!!
        }
        _SiJSON = ImageVector.Builder(
            name = "Regular.SiJSON",
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
                moveTo(9f, 16f)
                verticalLineToRelative(-1f)
                moveToRelative(3f, 1f)
                verticalLineToRelative(-1f)
                moveToRelative(3f, 1f)
                verticalLineToRelative(-1f)
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
            }
        }.build()

        return _SiJSON!!
    }

@Suppress("ObjectPropertyName")
private var _SiJSON: ImageVector? = null
